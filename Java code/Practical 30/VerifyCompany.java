// 1. Company Information:
// Create a Company class with fields companyName, ceoName, and employeesCount.
// Create a CompanyOperations class with methods to check if the company is large (more than 500 employees) or small (less than 50 employees).

import java.util.*;

public class VerifyCompany
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		
		Company company = new Company();
		
		System.out.print("What is company name : ");
		String CompanyName = sc.next();
		company.setCompanyName(CompanyName);
		
		System.out.print("Who is company CEO: ");
		String CEOName = sc.next();
		company.setCEOName(CEOName);

		System.out.print("Total employees in company: ");
		int count = sc.nextInt();
		company.setEmployeeCount(count);

		CompanyOperations companyOperation = new CompanyOperations();
		companyOperation.setCompany(company);
		companyOperation.getCompany();
	}
}

class Company
{
	// Store data like companyName, ceoName, and employeesCount.
	String companyName;
	String ceoName;
	int employeesCount;

	// Set Data for Company
	void setCompanyName(String name)
	{
		companyName = name;
	}
	void setCEOName(String CEOName)
	{
		ceoName = CEOName;
	}
	void setEmployeeCount(int count)
	{
		employeesCount = count;
	}

	// Get Data for Company
	String getCompanyName()
	{
		return companyName;
	}
	String getCEOName()
	{
		return ceoName;
	}
	int getEmployeeCount()
	{
		return employeesCount;
	}
}

class CompanyOperations
{
	Company company;

	void setCompany(Company c)
	{
		company = c;
	}
	void getCompany()
	{
		if(company.getEmployeeCount()<500)
		{
			System.out.print(company.getCompanyName()+" is Small scale company with "+ company.getEmployeeCount()+" Employee count whos CEO is "+ company.getCEOName());
		}
		else
		{
			System.out.print(company.getCompanyName()+" is Large scale company with "+ company.getEmployeeCount()+" Employee count whos CEO is "+ company.getCEOName());
		}
	}
}