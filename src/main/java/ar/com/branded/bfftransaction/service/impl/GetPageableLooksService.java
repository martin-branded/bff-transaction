package ar.com.branded.bfftransaction.service.impl;

import ar.com.branded.bfftransaction.model.domain.Look;
import ar.com.branded.bfftransaction.repository.RetriverLooks;
import ar.com.branded.bfftransaction.service.GetPageableLooks;
import jakarta.annotation.Resource;

import java.util.List;

public class GetPageableLooksService implements GetPageableLooks {
    @Resource(name = "retriverLooks")
    private RetriverLooks retriverLooks;

    @Override
    public List<Look> execute(int page, int size) {

        return retriverLooks.execute(page, size);
    }
}
