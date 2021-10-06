import tkinter as tk
from tkinter import ttk
win = tk.Tk()
win.title("Python GUI")

tabcontrol = ttk.Notebook(win)
tab1 = ttk.Frame(tabcontrol)
tab2 = ttk.Frame(tabcontrol)
tabcontrol.add(tab1, text='Tab 1')
tabcontrol.add(tab2, text='Tab 2')
tabcontrol.pack(expand=1, fill="both")

lblFrame = ttk.LabelFrame(tab2, text='Pengantar Pemrograman')
lblFrame.grid(column=0, row=0, padx=8, pady=4)

label_1 = ttk.Label(lblFrame, text="Masukkan Nama")
label_1.grid(column=0, row=0, sticky='w')

name_entered = ttk.Entry(lblFrame, width=12)
name_entered.grid(column=0, row=1)

win.mainloop()