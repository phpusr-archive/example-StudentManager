package org.dyndns.phpusr.contactmanager.util;

import org.springframework.stereotype.Service;

/**
 * @author phpusr
 *         Date: 08.04.12
 *         Time: 19:28
 */

@Service
public class Constants {
    public static final String PAGE_TEMPLATE = "../../template";
    public static final String PAGE_INDEX = "index";
    public static final String PAGE_LOGIN = "login";
    public static final String PAGE_STUDENT = "student";
    public static final String PAGE_ADD_STUDENT = "add";
    public static final String PAGE_DEL_STUDENT = "delete";

    public static final String PREFIX = "/";
    public static final String POSTFIX = ".htm";

    public static final String MAP_LOGIN = PREFIX + PAGE_LOGIN + POSTFIX;
    public static final String MAP_STUDENT = PREFIX + PAGE_STUDENT + POSTFIX;
    public static final String MAP_ADD_STUDENT = PREFIX + PAGE_ADD_STUDENT + POSTFIX;
    public static final String MAP_DEL_STUDENT = PREFIX + PAGE_DEL_STUDENT + POSTFIX;

    public static final String PARAM_DEL_STUDENT = "studentId";

    public static final String PAGE = "page";
}
