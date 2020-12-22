package com.codido.hodor.core.common.util;


/**
 * 密码工具类
 * @author janjan, xujian_jason@163.com
 *
 */
public class Password {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final String MD5_ALGORITHM = "MD5";
	public static final int HASH_INTERATIONS = 1024;
	public static final int SALT_SIZE = 8;
	
	/**
	 * 生成安全的密码，生成随机的16位salt并经过1024次 sha-1 hash
	 */
	public static String entryptPassword(String plainPassword) {
		String plain = Encodes.unescapeHtml(plainPassword);
		byte[] salt = Digests.generateSalt(SALT_SIZE);
		byte[] hashPassword = Digests.sha1(plain.getBytes(), salt, HASH_INTERATIONS);
		return Encodes.encodeHex(salt)+Encodes.encodeHex(hashPassword);
	}
	
	/**
	 * 验证密码
	 * @param plainPassword 明文密码
	 * @param password 密文密码
	 * @return 验证成功返回true
	 */
	public static boolean validatePassword(String plainPassword, String password) {
		String plain = Encodes.unescapeHtml(plainPassword);
		byte[] salt = Encodes.decodeHex(password.substring(0,16));
		byte[] hashPassword = Digests.sha1(plain.getBytes(), salt, HASH_INTERATIONS);
		return password.equals(Encodes.encodeHex(salt)+Encodes.encodeHex(hashPassword));
	}
	
	/* ================= test ================= */
	public static void main(String[] args) {
		System.out.println(entryptPassword("e10adc3949ba59abbe56e057f20f883e"));
		System.out.println(validatePassword("e10adc3949ba59abbe56e057f20f883e", "cf8974c09eec3d95dd352641f0aefc1dced342eb0fdc466fcfd97f55"));
	}
	
}
