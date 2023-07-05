package com.alicavad.azercosmos.service;

import com.alicavad.azercosmos.entity.TableF15;
import com.alicavad.azercosmos.entity.TableF16;
import com.alicavad.azercosmos.entity.TableF17;
import com.alicavad.azercosmos.entity.TableF18;
import com.alicavad.azercosmos.repository.TableF15Repository;
import com.alicavad.azercosmos.repository.TableF16Repository;
import com.alicavad.azercosmos.repository.TableF17Repository;
import com.alicavad.azercosmos.repository.TableF18Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TableService {

    private final TableF15Repository tableF15Repository;
    private final TableF16Repository tableF16Repository;
    private final TableF17Repository tableF17Repository;
    private final TableF18Repository tableF18Repository;


    public List<TableF15> getAllDataFromF15() {
        return tableF15Repository.findAll();
    }

    public List<TableF16> getAllDataFromF16() {
        return tableF16Repository.findAll();
    }

    public List<TableF17> getAllDataFromF17() {
        return tableF17Repository.findAll();
    }

    public List<TableF18> getAllDataFromF18() {
        return tableF18Repository.findAll();
    }
}
