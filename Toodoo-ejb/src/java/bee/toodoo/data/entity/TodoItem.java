/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bee.toodoo.data.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rishabh
 */
@Entity
@Table(name = "TodoItem")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "TodoItem.findAll", query = "SELECT t FROM TodoItem t"),
	@NamedQuery(name = "TodoItem.findByIdTodoItems", query = "SELECT t FROM TodoItem t WHERE t.idTodoItems = :idTodoItems"),
	@NamedQuery(name = "TodoItem.findByName", query = "SELECT t FROM TodoItem t WHERE t.name = :name"),
	@NamedQuery(name = "TodoItem.findByDescription", query = "SELECT t FROM TodoItem t WHERE t.description = :description"),
	@NamedQuery(name = "TodoItem.findByStatus", query = "SELECT t FROM TodoItem t WHERE t.status = :status")})
public class TodoItem implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTodoItems", nullable = false)
	private Integer idTodoItems;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name", nullable = false, length = 45)
	private String name;
	@Size(max = 150)
    @Column(name = "description", length = 150)
	private String description;
	@Basic(optional = false)
    @NotNull
    @Column(name = "status", nullable = false)
	private boolean status;

	public TodoItem() {
		this.status = false;
	}

	public TodoItem(Integer idTodoItems) {
		this.idTodoItems = idTodoItems;
	}

	public TodoItem(Integer idTodoItems, String name, boolean status) {
		this.idTodoItems = idTodoItems;
		this.name = name;
		this.status = status;
	}

	public Integer getIdTodoItems() {
		return idTodoItems;
	}

	public void setIdTodoItems(Integer idTodoItems) {
		this.idTodoItems = idTodoItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idTodoItems != null ? idTodoItems.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof TodoItem)) {
			return false;
		}
		TodoItem other = (TodoItem) object;
		if ((this.idTodoItems == null && other.idTodoItems != null) || (this.idTodoItems != null && !this.idTodoItems.equals(other.idTodoItems))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "bee.toodoo.data.entity.TodoItem[ idTodoItems=" + idTodoItems + " ]";
	}

}
