package poolingpeople.commons.domain.facades;

import poolingpeople.commons.domain.entities.Comment;
import java.util.Set;
import java.util.HashSet;
import poolingpeople.java.util.Collection;
import poolingpeople.commons.domain.entities.PoolingpeopleObject;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface CommentFacade  extends PoolingpeopleObjectFacade
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<Comment> getCommentsOfObject(PoolingpeopleObject parameter) ;
	
	
}

