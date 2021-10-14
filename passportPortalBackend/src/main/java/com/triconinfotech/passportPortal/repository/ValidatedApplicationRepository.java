package com.triconinfotech.passportPortal.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triconinfotech.passportPortal.models.ValidatedApplication;

@Repository
public interface ValidatedApplicationRepository extends JpaRepository<ValidatedApplication, UUID>{

}
