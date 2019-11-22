from numeros import numero_a_letras

# Pedirle las horas laboradas y el nombre al usuario
nombre = input("¿Cómo te llamas? ")
horas_laboradas = int(input("¿Cuántas horas laboraste esta semana? "))

# Calcular datos
sueldo = 150 if horas_laboradas <= 20 else 145

# Calcular horas extra
horas_extra = 0

if horas_laboradas > 40:
    horas_extra = horas_laboradas - 40
    horas_laboradas -= horas_extra

sueldo_calculado = horas_laboradas * sueldo
iva = sueldo * 0.16
sueldo_total = sueldo_calculado + iva
retencion = sueldo_calculado * 0.12
isr = sueldo_calculado * 0.1

# Calcular el sueldo a pagar :)
sueldo_a_pagar = sueldo_total - isr

if horas_laboradas > 20:
    sueldo_a_pagar -= retencion

# Calcular pago por las horas extra
if horas_extra > 0:
    pago_horas_extra = (horas_extra * 145) * 0.02
    sueldo_a_pagar += pago_horas_extra

sueldo_en_letras = numero_a_letras(sueldo_a_pagar)

print("**************************")
print("Nombre: {}\nHoras laboradas: {}\nSueldo: {}".format(nombre, horas_laboradas, sueldo_en_letras))
print("**************************")
