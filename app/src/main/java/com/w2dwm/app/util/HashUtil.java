package com.w2dwm.app.util;

import org.apache.commons.codec.binary.Base64;

public class HashUtil {

	public static String encode(String str) {
		byte[] bytesEncoded = Base64.encodeBase64(str.getBytes());
		return new String(bytesEncoded);
	}

	public static String decode(String str) {
		byte[] valueDecoded = Base64.decodeBase64(str);
		return new String(valueDecoded);
	}

}
