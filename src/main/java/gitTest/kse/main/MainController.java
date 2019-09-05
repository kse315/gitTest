 
package gitTest.kse.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Class Name : MainController.java
 * @Description : Main Controller Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2019.09.05           최초생성 
 * @ git Test 첫번째
 *
 * @author kse
 * @since 2019. 09.05
 * @version 1.0
 * @see
 *
 *  
 */

@Controller
public class MainController {
	
	/**
	 * main jsp 로 연결
	 * @param 
	 * @param model
	 * @return "/jsp"
	 * @exception Exception
	 */
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String main() throws Exception {
		System.out.println("test in");
		return "main/main";
	}
	 
}
