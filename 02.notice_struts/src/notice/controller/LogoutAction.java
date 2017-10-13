package notice.controller;

import javax.servlet.http.*;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;

import notice.model.LoginDAO;

public  class LogoutAction extends Action {  

  public ActionForward execute(ActionMapping mapping,
                               ActionForm form,
                               HttpServletRequest request,
                               HttpServletResponse response) {

		try{
			HttpSession session = request.getSession(false);
			if (session != null) {
				if (session.getAttribute("msg") != null) {
					session.removeAttribute("msg");
				}
				if (session.getAttribute("user") != null) {
					session.removeAttribute("user");
				}

				session.invalidate();
				return mapping.findForward("success");  
			} else {
				return mapping.findForward("failure");
			}

		}catch(Exception e){
			return mapping.findForward("error");
		}
	}
}     	
     
     
              
