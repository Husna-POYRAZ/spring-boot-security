package com.hpoyraz.demo.security;

import com.google.common.collect.Sets;
import lombok.AllArgsConstructor;

import java.util.Set;

import static com.hpoyraz.demo.security.ApplicationUserPermission.*;

@AllArgsConstructor
public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE));

    private final Set<ApplicationUserPermission> permissions;

}
