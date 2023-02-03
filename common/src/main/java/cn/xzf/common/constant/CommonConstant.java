package cn.xzf.common.constant;

/**
 * @Description: 通用常量
 * @author: jeecg-boot
 */
public interface CommonConstant {
	/** {@code 500 Server Error} (HTTP/1.0 - RFC 1945) */
    Integer SC_INTERNAL_SERVER_ERROR_500 = 500;
    /** {@code 200 OK} (HTTP/1.0 - RFC 1945) */
    Integer SC_OK_200 = 200;
    
    /**访问权限认证未通过 510*/
    Integer SC_JEECG_NO_AUTHZ=510;
}
