# FitNova - Fitness Management System

## 1. Introduction

The operational efficiency of a modern gym or fitness centre is heavily dependent on the seamless coordination of its members, trainers, and facilities. In many establishments, this coordination is still managed through manual processes such as spreadsheets, paper logs, or disparate digital tools or through basic, uncoordinated booking methods. These fragmented approaches often result in systemic inefficiencies, including double-booked sessions, missed appointments, scheduling conflicts, and a lack of transparent communication between members and trainers. Such issues not only lead to operational chaos and lost revenue but also diminish member satisfaction and trust.

To address these critical challenges, this project proposes the development of **FitNova**, a centralized, automated, and user-centric Fitness Management System. FitNova is designed to streamline the core operational workflows of a fitness facility. By enforcing strict business rules and providing role-based access, the system will ensure data integrity, eliminate scheduling conflicts, and deliver a reliable, conflict-free experience for all users.

---

## 2. Project Objectives

The primary objectives of FitNova are to provide a robust framework for managing the core entities of a gym members and trainers and their interactions. The system is designed to:

- **Secure Access Control:** Ensure that only authenticated, registered members can access the platform to create bookings, thereby preventing unauthorized use and maintaining a clear audit trail.

- **Establish Unique Identity:** Maintain unique identifiers for all members and trainers to ensure accountability, prevent duplicate records, and accurately track all activities across the platform.

- **Facilitate Proactive Availability Management:** Empower trainers to define their own availability by creating discrete, manageable time slots. Each slot will have a clear status (e.g., AVAILABLE or BOOKED) and be linked exclusively to a single trainer, providing complete visibility into scheduling capacity.

- **Enable Conflict-Free Booking:** Allow members to book only future, available slots, with the system proactively preventing double-booking for both members and trainers, ensuring no overlapping sessions occur under any circumstances.

- **Provide Comprehensive Booking Management:** Give members full control over their schedules by allowing them to view, modify, and cancel their own bookings, provided the cancellation occurs before the session's start time. Upon cancellation, the affected slot will automatically revert to an AVAILABLE state for other members to book.

- **Enforce Role-Based Business Logic:** Implement strict role-based access control (RBAC) where members can only interact with their own bookings, and trainers can only manage their own availability schedules, safeguarding data privacy and maintaining clear accountability boundaries.

- **Guarantee Real-Time Consistency:** Validate all booking actions, creation, modification, and cancellation in real time against current system data to prevent race conditions, ensure consistency, and maintain strict adherence to all business rules.

---

## 3. Project Scope

This document outlines the scope for the **Minimum Viable Product (MVP)** of FitNova. The MVP will focus on delivering a complete and functional core experience, laying the foundation for future enhancements.

### In-Scope (MVP Features)

#### Member Management
- Secure registration and login functionality for new and existing members, with unique member IDs generated upon account creation.

#### Trainer Management
- Profile management capabilities for trainers, allowing them to maintain their information and view their schedules.

#### Availability Management
- A dedicated interface for trainers to create, view, update, and delete their own availability time slots, with each slot clearly marked with date, time, and status.

#### Booking Workflow
- **Creation:** Members can view a list of available future slots across trainers and book a slot in a single, validated transaction.
- **Viewing:** Members can view a comprehensive list of their upcoming and past bookings, sorted chronologically.
- **Cancellation:** Members can cancel their future bookings, with the system automatically releasing the associated time slot back to AVAILABLE status.

#### Business Rule Enforcement
All system logic will be underpinned by automated checks to prevent:
- Double-booking of a member (no overlapping sessions for the same member)
- Double-booking of a trainer (no overlapping sessions for the same trainer)
- Booking of past or already-booked slots
- Cancellations after a session has started

#### Role-Based Access Control
The system will ensure that users can only access data and perform actions pertinent to their role (Member or Trainer), with no cross-management capabilities.

---

### Out-of-Scope (Future Enhancements)

- Administrative user roles with system-wide oversight and reporting capabilities
- Recurring booking patterns (e.g., weekly recurring sessions)
- Automated notifications (email, SMS) for booking confirmations, reminders, and cancellations
- Payment processing and subscription management integration
- Facility and resource management (e.g., booking gym equipment, group classes, or rooms)
- Advanced analytics and reporting dashboards for gym owners
- Waitlisting functionality for fully booked slots
- Mobile application (initial MVP will be web-based)

---

## 4. System Constraints & Assumptions

The design and development of FitNova will adhere to the following constraints and assumptions:

| Constraint | Description |
|------------|-------------|
| **Data Integrity** | Members and trainers are distinct entities with unique, system-generated IDs. Account sharing is strictly prohibited, and each user is responsible for their own credentials. |
| **Temporal Logic** | Bookings can only be created for time slots that are in the future relative to the current server time. Cancellations are only permitted up to the exact start time of the session. Any action on a slot that has already begun will be rejected by the system. |
| **Conflict Prevention** | The system will treat an overlapping session as any instance where a member or trainer has another booking whose time range intersects with the requested booking. Such overlaps are strictly forbidden at the point of creation. |
| **Separation of Concerns** | The system's logic will strictly separate responsibilities. A trainer's functions are limited to managing their own availability; a member's functions are limited to managing their own bookings. There is no cross-management capability in the MVP. |
| **Atomic Operations** | All booking operations will be treated as atomic transactions to prevent race conditions in a multi-user environment. This ensures that a single available slot cannot be double-booked by two members making simultaneous requests. |
| **Single Facility Assumption** | The MVP assumes a single gym location. Multi-location support is considered a future enhancement. |

---

## 5. Expected Outcomes

By successfully implementing the features and adhering to the constraints outlined above, FitNova is expected to deliver the following tangible outcomes:

| Outcome | Description |
|---------|-------------|
| **Operational Efficiency** | Elimination of manual scheduling errors, double-bookings, and missed appointments, leading to a significant reduction in administrative overhead and a streamlined daily operation for gym staff. |
| **Enhanced User Experience** | Members will benefit from a reliable, self-service platform that allows them to manage their fitness journey with ease and confidence. Trainers will have clear control over their schedules, reducing stress and enabling them to focus on delivering quality sessions. |
| **Data Integrity & Reliability** | A centralized system ensures that all data is consistent, auditable, and reflects the ground truth of the facility's schedule at any given moment, providing a single source of truth for all stakeholders. |
| **Conflict-Free Scheduling** | The core business rules will guarantee that no member or trainer is ever assigned to two overlapping sessions, ensuring a smooth, professional, and trustworthy operation. |
| **Scalable Foundation** | The MVP will establish a clean, modular architecture that can be easily extended to include new features like administrative dashboards, notifications, and payment systems in future iterations. |

---


## FitNova UML Diagram
![FitNova UML Diagram](https://github.com/220212317/FitNova/blob/master/Fitness%20App.drawio.svg)
