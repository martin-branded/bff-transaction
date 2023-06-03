package ar.com.branded.bfftransaction.repository;

import ar.com.branded.bfftransaction.model.domain.Look;

import java.util.List;

public interface RetriverLooks {
    List<Look> execute(int page, int size);
}
