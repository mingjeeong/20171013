package notice.controller;

import javax.servlet.http.*;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
// import org.apache.struts.action.*;    // 1. 실행성능과 상관없음.  3. 하지만 코드의 가독성을 키운다. 즉, 유지보수를 올린다.

import notice.model.LoginDAO;

public  class LoginAction extends Action{  // 2. 컴파일시에 org.apache.struts.action.Action 변경되어 컴파일함.

  public ActionForward execute(ActionMapping mapping,
                               ActionForm form,
                               HttpServletRequest request,
                               HttpServletResponse response) {

		try{

  			String user=request.getParameter("user");
  			String pass=request.getParameter("pass");

            //boolean check=new LoginDAO().loginCheck(user,pass);
            boolean check = LoginDAO.getInstance().loginCheck(user, pass);

			if(check){
				HttpSession session = request.getSession();
				session.setAttribute("user",user);
				
				request.setAttribute("msg","로그인 되었습니다.");
				return mapping.findForward("success");   
                // result.jsp view 이름을 직접적으로 명시하면 view 관리가힘들다. 이름을 변경해서 써라-> struts-config.xml 에 정의
				// ActionForward
			}

			return mapping.findForward("failure");

		}catch(Exception e){
			return mapping.findForward("error");
		}
	}
}     	
     
     
              
