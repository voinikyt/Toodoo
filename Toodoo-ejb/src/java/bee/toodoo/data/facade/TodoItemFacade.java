/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bee.toodoo.data.facade;

import bee.toodoo.data.entity.TodoItem;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rishabh
 */
@Stateless
public class TodoItemFacade extends AbstractFacade<TodoItem> {
	@PersistenceContext(unitName = "Toodoo-ejbPU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public TodoItemFacade() {
		super(TodoItem.class);
	}
	
}
