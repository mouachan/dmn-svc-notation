package org.redhat.notation;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.kie.dmn.api.core.DMNDecisionResult;
import org.kie.dmn.api.core.DMNMessage;

public class DMNDecisionNotationResult implements DMNDecisionResult {

    private String decisionName;

    private Object result;

    private String decisionId;

    public DMNDecisionNotationResult(String decisionName, Object result) {
        this.decisionName = decisionName;
        this.result = result;
        this.decisionId = String.valueOf(new Random().nextInt());
    }

    @Override
    public String getDecisionId() {
        return decisionId;
    }

    @Override
    public String getDecisionName() {
        return decisionName;
    }

    @Override
    public DecisionEvaluationStatus getEvaluationStatus() {
        return DecisionEvaluationStatus.SUCCEEDED;
    }

    @Override
    public Object getResult() {
        return result;
    }

    @Override
    public List<DMNMessage> getMessages() {
        return new ArrayList<>();
    }

    @Override
    public boolean hasErrors() {
        return false;
    }
}