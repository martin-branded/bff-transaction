package ar.com.branded.bfftransaction.repository.impl.cache;

import ar.com.branded.bfftransaction.model.domain.PreOrder;
import ar.com.branded.bfftransaction.repository.SaveOrder;
import org.springframework.stereotype.Repository;

@Repository
public class SaveOrderRedis implements SaveOrder {
    @Override
    public void execute(PreOrder preOrder) {

    }
}
