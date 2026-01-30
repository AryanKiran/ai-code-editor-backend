package com.smartIDE.AiPoweredCodeEditor.entities;

import com.smartIDE.AiPoweredCodeEditor.enums.SubcriptionStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    @Id
    Long id;
    User user;
    Plan plan;
    String stripeSubscriptionId;

    SubcriptionStatus status;
    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd;
    Instant createdAt;
    Instant updatedAt;
}
