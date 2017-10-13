package notice.controller;

import javax.servlet.http.*;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
// import org.apache.struts.action.*;    // 1. ���༺�ɰ� �������.  3. ������ �ڵ��� �������� Ű���. ��, ���������� �ø���.

import notice.model.LoginDAO;

public  class LoginAction extends Action{  // 2. �����Ͻÿ� org.apache.struts.action.Action ����Ǿ� ��������.

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
				
				request.setAttribute("msg","�α��� �Ǿ����ϴ�.");
				return mapping.findForward("success");   
                // result.jsp view �̸��� ���������� ����ϸ� view �����������. �̸��� �����ؼ� ���-> struts-config.xml �� ����
				// ActionForward
			}

			return mapping.findForward("failure");

		}catch(Exception e){
			return mapping.findForward("error");
		}
	}
}     	
     
     
              
