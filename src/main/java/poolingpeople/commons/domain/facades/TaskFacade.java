package poolingpeople.commons.domain.facades;

import java.util.LinkedList;
import java.util.Set;
import poolingpeople.commons.domain.entities.Task;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Collection;
import poolingpeople.commons.domain.entities.User;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface TaskFacade  extends PoolingpeopleObjectFacade
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public List<Task> getTaskOfAssignee(User assignee) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<Task> getTaskOfCreator(User creator) ;
	
	
}

