package ar.com.branded.bfftransaction.service;

import ar.com.branded.bfftransaction.model.domain.Look;

import java.util.List;

public interface GetPageableLooks {

    List<Look> execute(int page, int size);
}
