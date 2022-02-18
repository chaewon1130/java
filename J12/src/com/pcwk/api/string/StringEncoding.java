package com.pcwk.api.string;
import org.apache.log4j.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringEncoding {
	final static Logger LOG = Logger.getLogger(StringEncoding.class);
	public static void main(String[] args) {
		String str = "가";
		
		try {
			// Encoding
			byte[] bArr = str.getBytes("UTF-8");
			byte[] bArrMS = str.getBytes("CP949"); // MS949
			LOG.debug("UTF-8 bArr : " + Arrays.toString(bArr));
			// UTF-8 bArr : [-22, -80, -128] 
			// 한글 : 3byte
			LOG.debug("CP949 bArrMS : " + Arrays.toString(bArrMS));
			// CP949 bArrMS : [-80, -95]
			// 한글 : 2byte
			
			// Decoding
			LOG.debug("UTF-8 : " + new String(bArr, "UTF-8"));
			// UTF-8 : 가
			LOG.debug("CP949 : " + new String(bArrMS, "CP949"));
			// CP949 : 가
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
}
