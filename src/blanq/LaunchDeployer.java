package blanq;

/*
 * git push -u origin production
 */

public class LaunchDeployer {

	public static void main(String[] args) {
		DeployParameters deployParameters = DeployParameters.getInstance();
		Deployer deployer = new Deployer(deployParameters);
		deployer.deploy();
		//		AutoScaling autoScaling = new AutoScaling(deployParameters);
		//		autoScaling.scale();
	}

}