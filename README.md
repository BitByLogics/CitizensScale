<div align="center">

# 📏 Citizens ScaleTrait

**Citizens ScaleTrait** is a lightweight Minecraft plugin that adds a `ScaleTrait` to [Citizens NPCs](https://www.spigotmc.org/resources/citizens.13811/), allowing you to resize NPCs with a single command.

Changes persist through server restarts, set it once and forget it!

![Issues](https://img.shields.io/github/issues-raw/YourUserName/CitizensScaleTrait)
[![Stars](https://img.shields.io/github/stars/YourUserName/CitizensScaleTrait)](https://github.com/YourUserName/CitizensScaleTrait/stargazers)

<a href="#"><img src="https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/compact/supported/spigot_46h.png" height="35"></a>
<a href="#"><img src="https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/compact/supported/paper_46h.png" height="35"></a>
<a href="#"><img src="https://raw.githubusercontent.com/intergrav/devins-badges/v3/assets/compact/available/modrinth_vector.svg" height="35"></a>

</div>

## 🔧 Features

- 📏 Scale any Citizens NPC up or down with precise control
- 💾 Size settings **persist through server restarts**
- ⚡ Lightweight with minimal performance impact
- 🎯 Simple one-command operation
- 🔄 Instant visual updates

## ✅ Requirements

- **Minecraft 1.21+** (or compatible Spigot versions)
- [Citizens](https://www.spigotmc.org/resources/citizens.13811/) plugin

---

## 📥 Installation

1. Download the latest version from [Modrinth](https://modrinth.com/project/citizens-scale/).
2. Place it in your server's `plugins/` directory.
3. Ensure [Citizens](https://www.spigotmc.org/resources/citizens.13811/) is installed and running.
4. Restart your server.
5. Start scaling your NPCs!

---

## 🧾 Commands

### `/npc attribute scale <scale>`
Sets the scale of the currently selected NPC.

**Examples:**
- `/npc attribute scale 2` → Makes the NPC twice its normal size
- `/npc attribute scale 0.5` → Shrinks the NPC to half size
- `/npc attribute scale 1.5` → Makes the NPC 50% larger
- `/npc attribute scale 0.25` → Creates a tiny NPC at quarter size

**Scale Range:** `0.01` to `15.0` (configurable limits may apply)

---

## 💡 How It Works

1. Select an NPC using Citizens' selection tools (`/npc select`).
2. Run `/npc attribute scale <value>` with your desired scale factor.
3. The NPC instantly resizes and the change is saved permanently.
4. The scale persists through server restarts and reloads.

---

## 🔐 Permissions

Uses standard Citizens permissions:
- `citizens.npc.attribute` - Required to modify NPC attributes
- 
---

## 📝 Notes

- Scale changes are applied instantly and saved to the Citizens database.
- NPCs retain their scaled size through server restarts and world reloads.
- Compatible with all standard Citizens NPC types and other traits.
- Very small scales (below 0.1) may cause rendering issues in some clients.

---

## 🛠️ Development

Built as an extension for the powerful [Citizens](https://github.com/CitizensDev/Citizens2) NPC framework.

Feel free to contribute improvements or report any issues you encounter! 🚀