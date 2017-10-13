package notice.controller;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import notice.model.NoticeDAO;

public  class DeleteAction extends Action{

  public ActionForward execute(ActionMapping mapping,
                                                          ActionForm form,
                                                          HttpServletRequest request,
                                                          HttpServletResponse response) {

        try {
            
			NoticeDAO dao=NoticeDAO.getInstance();
			int num = Integer.parseInt(request.getParameter("num"));
			dao.noticeDelete(num);

            request.setAttribute("msg","����ó�� �Ǿ����ϴ�.");
			
            return mapping.findForward("success");
		
        }catch(Exception e){
			request.setAttribute("msg","������ ���� �߻��߽��ϴ�.");
			return mapping.findForward("error");
		}
	}
}     	
     
     
