public class StateInfo {

	/**
	 * The set of state IDs.
	 */
	public List<Integer> states;

	/**
	 * The set of immediate successors.
	 */
	public Map<Integer, List<Integer>> successors;

	/**
	 * The set of state labels.
	 */
	public Map<Integer, List<Label>> labels;

	public StateInfo() {
		states = new ArrayList<Integer>();
		successors = new HashMap<Integer, List<Integer>>();
		labels = new HashMap<Integer, List<Label>>();
	}
}
