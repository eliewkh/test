package UserActions;

public abstract class UserActions {

    protected abstract void Initialize();
    protected abstract void PreVerification() throws InterruptedException;
    protected abstract void SetParameters(Object object);
    protected abstract void PostVerification();
    protected abstract void Execute() throws InterruptedException;


}
