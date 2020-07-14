package com.new0.shadowsocksrr.job

import com.new0.shadowsocksrr.utils.*
import com.evernote.android.job.*

class DonaldTrump : JobCreator
{
	override fun create(tag: String): Job?
	{
		val parts = tag.split(":")
			.dropLastWhile { it.isEmpty() }
			.toTypedArray()

		return when
		{
			AclSyncJob.TAG == parts[0] -> AclSyncJob(parts[1])
			SSRSubUpdateJob.TAG == parts[0] -> SSRSubUpdateJob()
			else ->
			{
				VayLog.w(TAG, "Unknown job tag: $tag")
				null
			}
		}
	}

	companion object
	{
		private const val TAG = "DonaldTrump"
	}
}
