/*---------------------------------------------------------------------------------------------
 * NAME   : notice.model.Notice
 * DESC   : �������� ó���� �����ϴ� ���� Ŭ����
 *---------------------------------------------------------------------------------------------
 *			��				��				��				��
 *---------------------------------------------------------------------------------------------
 *	   DATE			     AUTHOR					DESCRIPTION 
 *---------------------------------------------------------------------------------------------
 *---------------------------------------------------------------------------------------------
*/
package notice.model;

import java.io.Serializable;

/**
 *<pre>
 * �������� ������ �����ϰ�, �����ϱ� ���� Ŭ����
 *</pre>
 *
 */
public class Notice implements Serializable{
	private int  num;    		
	private String writer;
	private String inDate;	
	private String title;
	private String content;
	
/**
* Default Constructor
*/	
	public Notice(){}
/**
* ��ü ������ �������� ��ȣ, �ۼ���, �ۼ�����, ������ �����ϱ����� ������
* @param num �������� ��ȣ
* @param writer �ۼ���
* @param inDate �ۼ�����
* @param title ����
*/	
	public Notice(int num,String writer,String inDate,String title){
		this(num,writer,inDate,title,"");
	}
/**
* ��ü ������ �������� ��ȣ, �ۼ���, �ۼ�����, ����,������ �����ϱ����� ������
* @param num �������� ��ȣ
* @param writer �ۼ���
* @param inDate �ۼ�����
* @param title ����
* @param content ����
*/	
	public Notice(int num, String writer, String inDate, String title, String content){
		setNum(num);
		setWriter(writer);
		setInDate(inDate);
		setTitle(title);
		setContent(content);
	}
/**
* ��ȣ�� �����ϱ� ���� �޼ҵ�
* @param num ��ȣ
* @return void
*/	
  public void setNum(int num){this.num=num;}
/**
* �ۼ��ڸ� �����ϱ� ���� �޼ҵ�
* @param writer �ۼ���
* @return void
*/	
  public void setWriter(String writer){this.writer=writer;}
/**
* �ۼ��ϸ� �����ϱ� ���� �޼ҵ�
* @param inDate �ۼ���
* @return void
*/	
  public void setInDate(String inDate){this.inDate=inDate;}
/**
* ���� �����ϱ� ���� �޼ҵ�
* @param title ����
* @return void
*/	
  public void setTitle(String title){this.title=title;}
/**
* ���븦 �����ϱ� ���� �޼ҵ�
* @param content  ����
* @return void
*/	
  public void setContent(String content){this.content=content;}
/**
* ��ȣ�� �����ϱ� ���� �޼ҵ�
* @return int :��ȣ
*/	
  public int getNum(){return num;}
/**
* ���̵� �����ϱ� ���� �޼ҵ�
* @return String : ���̵�
*/	
  public String getWriter(){return writer;}
/**
* �ۼ��ϸ� �����ϱ� ���� �޼ҵ�
* @return String : �ۼ���
*/	
  public String getInDate(){return inDate;}
/**
* ���� �����ϱ� ���� �޼ҵ�
* @return String : ����
*/	
  public String getTitle(){return title;}
/**
* ���븦 �����ϱ� ���� �޼ҵ�
* @return String : ����
*/	
  public String getContent(){return content;}
/**
* Notice ��ü�� ������ �ִ� ���� ���ڿ��� �����մϴ�.
* @return String : ��ü�� ����� �Ӽ�����
*/	
  public String toString(){
	  return num+":"+writer+":"+inDate+":"+title;
  }
}