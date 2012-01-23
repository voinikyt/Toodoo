/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bee.toodoo.controller;

import bee.toodoo.data.entity.TodoItem;
import bee.toodoo.data.facade.TodoItemFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author rishabh
 */
@Named(value = "todoItemController")
@RequestScoped
public class TodoItemController {
	@EJB
	private TodoItemFacade todoItemFacade;

	/**
	 * Creates a new instance of TodoItemController
	 */
	public TodoItemController() {
	}
	
	public List <TodoItem> viewAll() {
		return todoItemFacade.findAll();
	}
}
