using Microsoft.VisualBasic;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    // Klass som representerar enhet "Ci"
    public class Entity

    {
        public string EntityType { get; set; }
        public int EntityTypeID { get; set; }
        string ReferenceNo { get; set; }
        string ExternalReference { get; set; }
        public string Name { get; set; }
        public string LeaseAgreementNumber { get; set; }
        public string CostCenter { get; set; }
        public string CostCenter2 { get; set; }
        public string ContractNumber { get; set; }
        public float OriginalRent {  get; set; }
        public string ContractEnd {  get; set; }
        public string ContractStart { get; set; }
        public string AgeAtContractEnd { get; set; }
        public string CiGroupId;
        public string PurchasePrice { get; set; }
        public string FinancialType { get; set; }
        public string InvoiceNumber { get; set; }
        int DepartmentId;
        public int OrganizationId { get; set; }
        public string SerialNumber { get; set; }
        public string Location { get; set; }
        public string PickupAdress { get; set; }

        int ProductId;
        int Vendord;

        public Entity(string name, string serialNumber, int organizationId, int productGroupId, string costCenter, string costCenter2, string contractNumber, string contractEnd, string contractStart, string ageAtContractEnd, string purchasePrice, string financialType, string location, string pickupAdress)
        {
            EntityType = "Ci";
            EntityTypeID = productGroupId;
            ReferenceNo = serialNumber;
            ExternalReference = serialNumber;
            Name = name;
            SerialNumber = serialNumber.ToUpper();
            OrganizationId = organizationId;
            CostCenter = costCenter;
            CostCenter2 = costCenter2;
            ContractNumber = contractNumber;
            ContractEnd = contractEnd;
            ContractStart = contractStart;
            AgeAtContractEnd = ageAtContractEnd;
            PurchasePrice = purchasePrice;
            FinancialType = financialType;
            Location = location;
            PickupAdress = pickupAdress;
        }

        public Entity(string serialNumber)
        {
            if (serialNumber is not null)
            {
               serialNumber = serialNumber.ToUpper();
            }
            SerialNumber = serialNumber;
        }
    }
}
