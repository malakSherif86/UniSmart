#!/bin/bash

# Oracle Database Connection Details
DB_USER=CASE
DB_PASSWORD=case
DB_SID=XE

# Backup Directory
BACKUP_DIR="/f/1233/app/oracle"

# Date Format for Backup File
DATE_FORMAT=$(date +"%d-%m-%Y_%H%M")

# Export File Name (only the file name, not the full path)
EXPORT_FILE="backup_${DATE_FORMAT}.dmp"

# Oracle Data Pump Export Command
expdp ${DB_USER}/${DB_PASSWORD}@${DB_SID} DIRECTORY=DATA_PUMP_DIR DUMPFILE=${EXPORT_FILE} FULL=Y

# Check if the export was successful
if [ $? -eq 0 ]; then
    echo "Database backup successful. File: ${EXPORT_FILE}"
else
    echo "Error: Database backup failed."
fi
