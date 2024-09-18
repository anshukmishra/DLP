package client.processSteps;

import client.entity.Context;

public interface ProcessStep {
    public void execute(Context context) throws Exception;
    public String getName();
}
