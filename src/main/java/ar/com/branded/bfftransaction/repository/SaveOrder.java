package ar.com.branded.bfftransaction.repository;

import ar.com.branded.bfftransaction.model.domain.PreOrder;

public interface SaveOrder {
    void execute(PreOrder preOrder);
}
