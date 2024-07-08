package com.edu.bo.audit.auditing;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class ApplicationAuditAware implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        //return Optional.empty("Marco Cardenas");
        return Optional.of("Marco Cardenas");

//        @Override
//        public Optional<Integer> getCurrentAuditor() {
//            Authentication authentication =
//                    SecurityContextHolder
//                            .getContext()
//                            .getAuthentication();
//            if (authentication == null ||
//                    !authentication.isAuthenticated() ||
//                    authentication instanceof AnonymousAuthenticationToken
//            ) {
//                return Optional.empty();
//            }
//
//            User userPrincipal = (User) authentication.getPrincipal();
//            return Optional.ofNullable(userPrincipal.getId());
//        }
    }
}
