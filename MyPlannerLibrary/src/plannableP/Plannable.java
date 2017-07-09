package plannableP;

import plannerP.Action;
import plannerP.Clause;
import plannerP.Predicate;

public interface Plannable 
{
	//public Set<Action> getSatisfyingActions(Predicate top);
	public Action getSatisfyingAction(Predicate top);
	public Clause getKnowledgeBase();
	public Clause getGoal();
	
}
