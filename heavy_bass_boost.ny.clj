;nyquist plug-in
;version 4
;type process
;name "Heavy Bass Boost"
;action "Applying Heavy Bass Boost..."
;info "This plugin applies a heavy bass boost effect to the selected audio."

;control gain "Bass Gain (dB)" real "0" -30 30
;control frequency "Boost Frequency (Hz)" real "100" 20 200

(let* ((bass (notch2 s frequency 0.5))
       (boost (mult s (db-to-linear gain))))
  (sum bass boost))
