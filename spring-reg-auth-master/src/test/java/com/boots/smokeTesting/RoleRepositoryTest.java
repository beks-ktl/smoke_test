package com.boots.smokeTesting;

import com.boots.entity.Role;
import com.boots.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@SpringBootTest
public class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void testSaveRole() {
        Role role = new Role(3B, "ROLE_USER");
        roleRepository.save(role);

        Role savedRole = roleRepository.findById(3B).orElse(null);

        assert (savedRole != null);
    }
}

