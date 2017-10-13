package notice.controller;

import org.apache.struts.action.RequestProcessor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/*
 * RequestProcessor Ŭ������ ��� Action�� ����Ǳ����� 
 * request, response �� ����Ǿ���� ���׵��� ����ϴ� Ŭ����
 */
public class  EncodingRequestProcessor extends RequestProcessor { // extends RequestProcessor
    public boolean processPreprocess(HttpServletRequest req, HttpServletResponse res) {
        // ��� Action�� ����Ǳ����� request ���ڵ� ����
        try {
            req.setCharacterEncoding("euc-kr");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return true;
    }

}
