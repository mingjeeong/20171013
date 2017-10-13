package notice.controller;

import org.apache.struts.action.RequestProcessor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/*
 * RequestProcessor 클래스가 모든 Action이 실행되기전에 
 * request, response 에 실행되어야할 사항들을 명시하는 클래스
 */
public class  EncodingRequestProcessor extends RequestProcessor { // extends RequestProcessor
    public boolean processPreprocess(HttpServletRequest req, HttpServletResponse res) {
        // 모든 Action이 수행되기전에 request 인코딩 설정
        try {
            req.setCharacterEncoding("euc-kr");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return true;
    }

}
