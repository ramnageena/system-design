# <h1 align="center"> Design Patterns</h1>

## 🔒 Singleton Pattern
[![Java](https://img.shields.io/badge/language-Java-orange)](https://www.oracle.com/java/)

Ensures a class has **only one instance** and provides a **global access point** to it.


# 📌 When to Use
- When only **one object** is needed across the application
- For **logging**, **configuration**, **database connection**, or **cache**


# ⚙️ Variants
- ⚪ **Lazy** – created on first use (not thread-safe)
- 🔐 **Synchronized** – thread-safe, slightly slower
- ⚡ **Double-Checked Locking** – better performance


# ⚠️ Notes
- Use `readResolve()` to handle **serialization**
- Protect constructor to avoid **reflection issues**

---
