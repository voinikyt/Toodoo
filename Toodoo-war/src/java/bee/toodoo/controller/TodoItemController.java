/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bee.toodoo.controller;

import bee.toodoo.data.entity.TodoItem;
import bee.toodoo.data.facade.TodoItemFacade;
import com.sun.faces.facelets.Facelet;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author rishabh
 */
@Named(value = "todoItemController")
@RequestScoped
public class TodoItemController {
	@EJB
	private TodoItemFacade todoItemFacade;

	private TodoItem todoItem;

	/**
	 * Creates a new instance of TodoItemController
	 */
	public TodoItemController() {
		todoItem = new TodoItem();
	}

	public List <TodoItem> viewAll() {
		return todoItemFacade.findAll();
	}

	public void createNew(ActionEvent ae) {

		

		todoItemFacade.createNew(todoItem);
	}

	public TodoItem getTodoItem() {
		return todoItem;
	}

	public void setTodoItem(TodoItem todoItem) {
		this.todoItem = todoItem;
	}


}
