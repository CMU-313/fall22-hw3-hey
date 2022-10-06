package com.sismics.docs.core.dao;

import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import at.favre.lib.crypto.bcrypt.BCrypt;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sismics.docs.core.constant.AuditLogType;
import com.sismics.docs.core.constant.Constants;
import com.sismics.docs.core.dao.criteria.UserCriteria;
import com.sismics.docs.core.dao.dto.UserDto;
import com.sismics.docs.core.model.jpa.Applicant;
import com.sismics.docs.core.model.jpa.User;
import com.sismics.docs.core.util.AuditLogUtil;
import com.sismics.docs.core.util.EncryptionUtil;
import com.sismics.docs.core.util.jpa.QueryParam;
import com.sismics.docs.core.util.jpa.QueryUtil;
import com.sismics.docs.core.util.jpa.SortCriteria;
import com.sismics.util.context.ThreadLocalContext;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.sql.Timestamp;
import java.util.*;

public class ApplicantDao {

    public String create(Applicant applicant, String applicantId) throws Exception {
        EntityManager em = ThreadLocalContext.get().getEntityManager();
        // Create the user
        applicant.setId(UUID.randomUUID().toString());
        //setId = applicant.setId(applicantId);
        em.persist(applicant);
        return applicant.getId();
    }
}
