/*------------------------------------------------------------------------- 
 * 版权所有：
 * 作者：姜晗
 * 联系方式：tonghuajianghan@gmail.com 
 * 创建时间：2015-9-21 下午1:41:10 
 * 版本号：v1.0 
 * 本类主要用途描述： 
 * 
-------------------------------------------------------------------------*/
package com.jh.dev.dao;

import org.springframework.stereotype.Repository;

import com.jh.core.dao.BaseDao;
import com.jh.core.util.Condition;
import com.jh.dev.bo.Menu;
import com.jh.dev.bo.Module;

/** 
 * 菜单dao
 *
 * @ClassName: MenuDao 
 * @author jh 
 * @date 2015-9-21 下午4:54:44 
 *  
 */
@Repository
public class MenuDao extends BaseDao{

	/** 
	 * 更新菜单
	 *
	 * @Title: update 
	 * @Author: jianghan
	 * @param menu
	 * @return
	 *    
	 */
	public void updateMenu(Menu menu){
		Condition<Menu> conditionParam = new Condition<Menu>();
		super.update(menu);
	}
	
	/** 
	 * 保存菜单
	 *
	 * @Title: save 
	 * @Author: jianghan
	 * @param menu
	 * @return
	 *    
	 */
	public void saveMenu(Menu menu){
		Condition<Menu> conditionParam = new Condition<Menu>();
		super.save(menu);
	}
	
}
