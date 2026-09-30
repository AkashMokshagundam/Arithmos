# Arithmos — Graphing Calculator & Computational Suite

![Java](https://img.shields.io/badge/Language-Java%2022-orange?style=for-the-badge&logo=java)
![Platform](https://img.shields.io/badge/Platform-Windows%2010%20%7C%2011-blue?style=for-the-badge&logo=windows)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Release%20v1.0.0-brightgreen?style=for-the-badge)

**Arithmos** is an advanced desktop computational environment and multi-dimensional visualization suite built using **Java (JDK 22)** and Java Swing. It bridges the gap between standard desktop calculators and complex scientific computing packages by offering low-latency calculation, 2D/3D/4D spatial-temporal plotting, calculus utilities, special number-theoretic functions, and a multi-category unit converter.

---

## 🌐 Official Website & Downloads

You can download the Windows Installer (`Arithmos_Setup.exe`) directly from our official web portal:

👉 **[Visit the Arithmos Official Download Site](https://arithmos.odoo.com)**

---

## ✨ Key Features

### 1. High-Precision Mathematical Engine
* **Arithmetic & Powers:** Standard algebraic operations, exponentiation ($a^b$), arbitrary roots ($\sqrt[n]{x}$), modulus, and absolute values.
* **Trigonometry:** Full direct and inverse functions ($\sin, \cos, \tan, \csc, \sec, \cot$ and their arc-variants) with dynamic **RAD / DEG** mode toggling.
* **Hyperbolic Functions:** Complete direct and inverse hyperbolic suite ($\sinh, \cosh, \tanh$, etc.).
* **Special Functions:**
  * **Signum Function:** $\text{sgn}(x)$
  * **Möbius Function:** $\mu(n)$ for prime factorization analysis.
  * **Riemann Zeta Function:** $\zeta(s)$ evaluation.

### 2. Calculus & Continuous Operations
* **Summation ($\sum$) & Pi Product ($\prod$):** Index-bound finite and infinite series evaluation.
* **Numerical Derivatives ($\frac{d}{dx}$):** Central-difference derivative evaluation at arbitrary domain points.
* **Definite Integrals ($\int_{a}^{b} f(x)dx$):** Numerical integration via adaptive quadrature algorithms.

### 3. Visual & Spatial-Temporal Engine
* **2D Cartesian Graphing:** Real-time plotting with auto-scaling axes, dynamic grid tracking, crosshair positioning, and asymptote handling.
* **3D Surface Rendering:** Wireframe projection and rendering for multi-variable functions $z = f(x, y)$ with interactive pitch/yaw/roll rotations.
* **4D / Temporal Dynamic Surface Morphing:** Animated rendering of time-dependent surfaces $z = f(x, y, t)$ operating on a 60 FPS update loop.

### 4. Unit Conversion Engine
Converts values across a vast array of physical quantities and SI / Imperial dimensions:
* **Length & Distance** (meters, miles, nautical miles, light-years, etc.)
* **Mass & Weight** (kilograms, pounds, metric tons, carats, etc.)
* **Temperature** (Celsius, Fahrenheit, Kelvin)
* **Time, Area, Volume, Velocity, Energy, Power, Pressure, and Digital Storage**

---

## 🛠️ Tech Stack & Toolchain

* **Core Runtime:** Java (JDK 22)
* **GUI Engine:** Java Swing (`javax.swing`) & Java 2D Engine (`java.awt`)
* **Executable Packaging:** Launch4j 3.x (`arithmos.exe`)
* **Installer Compilation:** Inno Setup Compiler 6.x (`Arithmos_Setup.exe`)
* **Distribution Hosting:** [Odoo Web Builder](https://arithmos.odoo.com) & GitHub Releases

---

## 💻 Local Setup & Building from Source

To build and run **Arithmos** from source using JDK 22:

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/AkashMokshagundam/Arithmos.git](https://github.com/AkashMokshagundam/Arithmos.git)
   cd Arithmos
