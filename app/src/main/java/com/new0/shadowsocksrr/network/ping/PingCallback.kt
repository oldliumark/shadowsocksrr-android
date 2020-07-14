package com.new0.shadowsocksrr.network.ping

import com.new0.shadowsocksrr.database.*

open class PingCallback
{
	/**
	 * test result message
	 */
	open var resultMsg: String = ""

	/**
	 * ping success
	 *
	 * @param elapsed ping elapsed
	 */
	open fun onSuccess(profile: Profile, elapsed: Long)
	{
	}

	/**
	 * ping failed
	 */
	open fun onFailed(profile: Profile?)
	{
	}

	/**
	 * ping finished
	 */
	open fun onFinished(profile: Profile?)
	{
	}
}
