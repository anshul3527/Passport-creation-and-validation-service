package com.triconinfotech.passportPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triconinfotech.passportPortal.models.OfficerDetails;

@Repository
public interface OfficerRepository extends JpaRepository<OfficerDetails, String> {

}
