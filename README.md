# IT Supply Manager — Programming II Final Project (2019)

> Final project for the Programming II course — UTU ESI Buceo, 2019.
> Authors: Joaquin Rossi, Yorel Acosta — 2BC

A layered Java desktop application for managing IT supplies (hardware and software components) and generating quotes for PC assembly and network cabling jobs. Built with Swing for the UI and MySQL for persistence.

---

## Architecture

```
src/
├── logic/         # Business logic and domain entities
├── persistence/   # MySQL data access layer
└── design/        # Swing UI (NetBeans-generated forms)
```

### Layer responsibilities

| Layer | Package | Responsibility |
|---|---|---|
| Presentation | `design` | Swing forms — supply manager UI and quote forms |
| Logic | `logic` | Domain entities, price calculation, quote generation |
| Persistence | `persistence` | MySQL queries (CRUD) for supplies and quotes |

---

## Domain Model

```
Supply (abstract)
├── Hardware    — RAM, CPU, GPU, Storage, Case, PSU, Motherboard
└── Software    — OS images and licensed software

Quote (abstract)
├── PcAssembly   — Quote for assembling a PC (base, gaming, workstation)
└── NetworkSetup — Quote for structured cabling (home or business)
```

### Hardware components

| Type | Key attributes | Price factors |
|---|---|---|
| RAM | Technology (DDR3/DDR4), capacity (GB), frequency (MHz) | Tech + capacity + freq bonuses |
| CPU | Cores, frequency (GHz), brand | Cores + freq bonuses |
| GPU | VRAM (GB) | Memory size bonus |
| Storage | Capacity (GB), type (HDD/SSD/M2/EXT) | Tech + capacity bonuses |
| Case | Form factor (Desktop/Modding/Rack/Mini Tower) | Form factor bonus |
| PSU | Wattage (W) | Wattage bonus |
| Motherboard | RGB support | RGB bonus |

---

## Quote types

### PC Assembly (`PcAssembly`)

Calculates a quote for assembling a complete PC:

- `subtotal` = sum of selected supply prices × quantities
- `laborCost` = hourly rate × hours worked
- `total` = (subtotal + laborCost) × purpose markup

| Purpose | Markup |
|---|---|
| Standard | 1.00× |
| Gaming | 1.05× |
| Workstation | 1.10× |

### Network Setup (`NetworkSetup`)

Quote for structured cabling installations:
- Home/apartment network
- Business/building network

Fields: ISP, data plan, upload/download speeds, router count, cable length (m).

---

## Tech Stack

- **Java SE** (NetBeans IDE project)
- **Swing** — desktop UI
- **MySQL** — persistence via `com.mysql.jdbc.Driver`

---

## Setup

### Prerequisites

- JDK 8 or later
- NetBeans IDE (to open the `.form` files and run the project)
- MySQL Server running locally

### Database

Connect to a local MySQL instance. By default the app connects to:

```
Host:     localhost
Database: java_mysql
User:     root
Password: (empty)
```

To change these values, edit `src/persistence/DbConnection.java`.

### Running

1. Open the project in NetBeans (`Programa/ProyectoProgramacion2_JoaquinRossi-YorelAcosta_2BC/`).
2. Make sure MySQL is running.
3. Set `logic.Main` as the main class, or launch `design.MainForm` for the full GUI.

---

## Files

| File / Folder | Description |
|---|---|
| `src/logic/` | Domain classes and business logic |
| `src/persistence/` | MySQL data access |
| `src/design/` | Swing UI forms |
| `Diagramas/` | ER diagram and class diagram (PNG + .dia) |
| `Iconos/` | UI icon assets |
