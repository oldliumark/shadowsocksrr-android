package com.new0.shadowsocksrr.database

import com.j256.ormlite.field.*

class SSRSub
{
	@DatabaseField(generatedId = true)
	var id = 0

	@DatabaseField
	var url = ""

	@DatabaseField
	var url_group = ""
}
