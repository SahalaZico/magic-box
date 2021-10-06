import tkinter as tk
from tkinter import ttk

win = tk.Tk()

win.title("Antarmuka 2")

frame_1 = ttk.LabelFrame(win, text= 'Label pada frame 1')
frame_1.grid(column=0, row=0, padx=10, pady=5)

frame_2 = ttk.LabelFrame(win, text= 'Label pada frame 2')
frame_2.grid(column=0, row=1, padx=20, pady=10)

ttk.Label(frame_1, text="Label A").grid(column=0, row=0)
ttk.Label(frame_1, text="Label B").grid(column=1, row=0)
ttk.Label(frame_1, text="Label C").grid(column=2, row=0)

ttk.Label(frame_2, text="Label A").grid(column=0, row=0)
ttk.Label(frame_2, text="Label B").grid(column=0, row=1)
ttk.Label(frame_2, text="Label C").grid(column=0, row=2)

win.mainloop()
