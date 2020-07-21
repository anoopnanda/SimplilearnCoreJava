package BasicOps;

public class AccessModifierExampleA {
	private int pvy = 0;
	public char pbl;
	
	public void methodPublic(int arg1) {
		System.out.println("Setting pvy to:"+arg1);
		methodPrivate(arg1);
	}
	
	private void methodPrivate(int arg1) {
		pvy = arg1;
	}
	
	protected void methodProtected() {
		System.out.println("The current value of pvy is:"+pvy);
	}
	
}
