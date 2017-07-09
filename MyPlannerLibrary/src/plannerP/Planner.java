package plannerP;

import java.util.List;

import plannableP.Plannable;


public interface Planner 
{
	List<Action> plan(Plannable plannable);

	
}
